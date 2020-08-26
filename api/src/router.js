const express = require('express');
require('dotenv').config();

const app = express();
const router = express.Router();


const Lookup = require('./controller/lookupController');
const Sync = require('./controller/syncController');
const User = require('./controller/userController');


router.get('/ping', (req, res) => {
    res.json({ 
        status: 'success', 
        message: 'SC Health Check Passed. The api is running'
    });
});

// router.post('/login', Lookup.getAllProjects);
// router.get('/lookup/client', Lookup.getAllProjects);
// router.get('/register/client', Lookup.getAllProjects);
// router.post('/sync', Lookup.getAllProjects);
// router.get('/facility', Lookup.getAllProjects);


module.exports = router;