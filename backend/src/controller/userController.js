const { User } = require("../model");
const { to, ReE, ReS } = require("../utils");
const logTag = "userController";

module.exports.userLogin = async (req, res) => {
  try {
    console.log(req.body)
    if(req.body === undefined){
      return ReE(res, "Bad request", 400);
    }
    let user;
    let err;
    [err, user] = await to(User.findOne({
        where: {
            username: req.body.username,
            password_hash: req.body.password_hash
          }
    }));
    if (err) {
      return ReE(res, "Incorrect login", 422);
    }
    return ReS(res, { results: user }, 201);
  } catch (error) {
    return ReE(res, error.message, 500);
  }
};