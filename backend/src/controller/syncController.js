const { Sync } = require("../model");
const { to, ReE, ReS } = require("../utils");
const logTag = "syncController";

module.exports.getSyncRecords = async (req, res) => {
  try {
    let sync;
    let err;
    [err, sync] = await to(Sync.findAll());
    if (err) {
      return ReE(res, "Could not retrieved", 422);
    }
    return ReS(res, { sync: sync }, 201);
  } catch (error) {
    return ReE(res, error.message, 500);
  }
};

module.exports.postSyncRecords = async (req, res) => {
  try {

    if(req.body === undefined){
      return ReE(res, "Bad request", 400);
    }
    let client;
    let err;
    [err, client] = await to(Patient.bulkCreate(req.body));
    if (err) {
      return ReE(res, "Could not save sync records", 422);
    }
    return ReS(res, { results: client }, 201);
  } catch (error) {
    return ReE(res, error.message, 500);
  }
};