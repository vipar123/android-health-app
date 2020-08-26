module.exports = (sequelize, DataTypes) => {
    const Model = sequelize.define('Patient', {
      id: {
        type: DataTypes.INTEGER(11),
        autoIncrement: true,
        primaryKey: true,
      },
      patientNupn: {
        type: DataTypes.STRING,
        unique: true,
      },
      firstName: DataTypes.STRING,
      lastName: DataTypes.STRING,
      gender: DataTypes.STRING,
      dateOfBirth: DataTypes.TIMESTAMP,
      nrc: DataTypes.STRING
    }, {
      tableName: 'sync',
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