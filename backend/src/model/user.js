module.exports = (sequelize, DataTypes) => {
    const Model = sequelize.define('User', {
      id: {
        type: DataTypes.INTEGER(11),
        autoIncrement: true,
        primaryKey: true,
      },
      username: {
        type: DataTypes.STRING,
        unique: true,
      },
      password_hash: DataTypes.STRING,
      password_salt: DataTypes.STRING
    }, {
      tableName: 'users',
      timestamps: false,
      createdAt: 'created_at',
      updatedAt: 'updated_at',
      underscored: true,
    });
  

    Model.prototype.toWeb = function () {
      return this.toJSON();
    };
    return Model;
  };