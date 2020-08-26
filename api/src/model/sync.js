module.exports = (sequelize, DataTypes) => {
    const Model = sequelize.define('Sync', {
      id: {
        type: DataTypes.INTEGER(11),
        autoIncrement: true,
        primaryKey: true,
      },
      syncUUID: {
        type: DataTypes.STRING,
        unique: true,
      },
      dataType: DataTypes.STRING,
      content: DataTypes.STRING
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