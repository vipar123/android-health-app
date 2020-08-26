require('dotenv').config();
const config = {};
config.app = process.env.APP || 'dev';
config.port = process.env.PORT || '4000';
config.db_dialect = process.env.DB_DIALECT || 'mysql';
config.db_host = process.env.DB_HOST || "localhost";
config.db_port = process.env.DB_PORT || '3306';
config.db_name = process.env.DB_NAME || 'omldesign';
config.db_user = process.env.DB_USER || 'root';
config.db_password = process.env.DB_PASSWORD || '';
module.exports = config;