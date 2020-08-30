const { Facility, Patient } = require("../model");
const { to, ReE, ReS } = require("../utils");
const logTag = "lookupController";

module.exports.getFacility = async (req, res) => {
  try {
    let facility;
    let err;
    [err, facility] = await to(Facility.findAll());
    if (err) {
      return ReE(res, "Could not retrieved", 422);
    }
    return ReS(res, { facility: facility }, 201);
  } catch (error) {
    return ReE(res, error.message, 500);
  }
};

module.exports.getClient = async (req, res) => {
  try {

    if(req.body === undefined){
      return ReE(res, "Bad request", 400);
    }
    let client;
    let err;
    [err, client] = await to(Patient.findOne({
      id: req.body.name
    }));
    if (err) {
      return ReE(res, "Could not retrieved", 422);
    }
    return ReS(res, { results: client }, 201);
  } catch (error) {
    return ReE(res, error.message, 500);
  }
};