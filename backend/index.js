var express = require('express');
const app = express();
const bodyParser = require('body-parser');
const cors = require('cors');
const port = process.env.PORT || 8000;
const v1 = require('./src/router');
const config = require("./src/config")
const models = require('./src/model');

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(cors());
app.use('/rest-api/v1', v1);

//populate db
if (config.app === 'prod') {
    models.sequelize.sync();
 }
 
 if (config.app === 'dev') {
    models.sequelize.sync();
    models.User.bulkCreate(require('./src/model/data/users.json'), { validate: false }).catch((errors) => {
    });
    models.Patient.bulkCreate(require('./src/model/data/patient.json'), { validate: false }).catch((errors) => {
        console.log(errors);
    });
    models.Facility.bulkCreate(require('./src/model/data/facility.json'), { validate: false }).catch((errors) => {
        console.log(errors);
    });
 }

app.listen(port, () => {
    console.log(`The api is running on http://localhost:${port}`)
})

module.exports = app;