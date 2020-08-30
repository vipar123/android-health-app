const express = require('express');
require('dotenv').config();

const app = express();
const router = express.Router();


const Lookup = require('./controller/lookupController');
const Sync = require('./controller/syncController');
const User = require('./controller/userController');
const Patient = require('./controller/PatientController');


router.get('/ping', (req, res) => {
    res.json({ 
        status: 'success', 
        message: 'SC Health Check Passed. The api is running'
    });
});

router.post('/login', User.userLogin);
router.post('/lookup/client', Lookup.getClient);
router.post('/register/client', Patient.savePatient);
router.post('/sync', Sync.postSyncRecords);
router.get('/sync', Sync.getSyncRecords);
router.get('/facility', Lookup.getFacility);


module.exports = router;