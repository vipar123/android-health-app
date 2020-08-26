var express = require('express');
const app = express();
const port = process.env.PORT || 8000;
const v1 = require('./src/router');


app.use('/rest-api/v1', v1);

app.listen(port, () => {
    console.log(`The api is running on http://localhost:${port}`)
})

module.exports = app;