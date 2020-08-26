// const { Project_Section } = require("../models");
// const { to, ReE, ReS } = require("../services/util.service");
// const log = require("../helpers/log");
// const logTag = "projectSectionController";

// module.exports.createProjectSection = async (req, res) => {
//   try {
//     let projectSection;
//     let err;
//     [err, projectSection] = await to(Project_Section.bulkCreate(req.body));
//     if (err) {
//       return ReE(res, "Could not insert project section", 422);
//     }
//     return ReS(res, { project: projectSection.toJSON() }, 201);
//   } catch (error) {
//     return ReE(res, error.message, 500);
//   }
// };

// module.exports.upsertProjectSection = async (req, res) => {
//   try {
//     let projectSection;
//     let err;
//     [err, projectSection] = await to(
//       Project_Section.bulkCreate(req.body, {
//         fields: ["content", "section_type", "project_id", "seq", "uuid"],
//         updateOnDuplicate: ["content"]
//       })
//     );
//     if (err) {
//       log.error(`${logTag} | upsertProjectSection()`, err);
//       return ReE(res, err, 422);
//     }
//     [err, sections] = await to(
//       Project_Section.findAll({
//         where: {
//           project_id: req.body[0].project_id
//         },
//         order: [["seq", "ASC"]]
//       })
//     );
//     return ReS(res, { sections: sections }, 201);
//   } catch (error) {
//     log.error(`${logTag} | upsertProjectSection()`, error);
//     return ReE(res, error.message, 500);
//   }
// };

// module.exports.updateProjectSection = async (req, res) => {
//   try {
//     let projectSection;
//     let err;

//     [err, projectSection] = await to(
//       Project_Section.update(req.body, {
//         where: { id: req.body.id }
//       })
//     );

//     if (err) {
//       log.error(`${logTag} | updateProjectSection()`, err);
//       return ReE(res, err.message, 422);
//     }
//     if (projectSection) {
//       const updatedPost = await to(
//         Project_Section.findOne({ where: { id: req.body.id } })
//       );
//       return ReS(res, { project: projectSection.toWeb() }, 201);
//     }
//     return ReE(res, err.message, 422);
//   } catch (error) {
//     return ReE(res, error.message, 500);
//   }
// };

// module.exports.deleteProjectSection = async (req, res) => {
//   try {
//     const { uri } = req.params;
//     const deleted = await Project_Section.destroy({
//       where: { id: uri }
//     });
//     if (deleted) {
//       return res.status(204).send("Project successfully removed");
//     }
//     throw new Error("Project does not exist");
//   } catch (error) {
//     log.error(`${logTag} | deleteProject()`, error.message);
//     return res.status(500).send(error.message);
//   }
// }; 