const { Patient } = require("../model");
const { to, ReE, ReS } = require("../utils");
const logTag = "PatientController";

module.exports.savePatient = async (req, res) => {
    try {
  
      if(req.body === undefined){
        return ReE(res, "Empty body", 400);
      }
      let client;
      let err;
      [err, client] = await to(Patient.create(req.body ));
      if (err) {
        return ReE(res, "Could not retrieved", 422);
      }
      return ReS(res, { results: client }, 201);
    } catch (error) {
      return ReE(res, error.message, 500);
    }
  };