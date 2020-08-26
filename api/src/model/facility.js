module.exports = (sequelize, DataTypes) => {
    const Model = sequelize.define('Facility', {
      id: {
        type: DataTypes.INTEGER(11),
        autoIncrement: true,
        primaryKey: true,
      },
      name: {
        type: DataTypes.STRING,
        unique: true,
      },
      code: DataTypes.STRING
    }, {
      tableName: 'facility',
      timestamps: false,
      createdAt: 'created_at',
      updatedAt: 'updated_at',
      underscored: true,
    });
  
    // Model.associate = (models) => {
    //   Model.hasMany(models.Users, {
    //     foreignKey: 'user_id',
    //     onDelete: 'CASCADE',
    //   });
    // };
    Model.prototype.toWeb = function () {
      return this.toJSON();
    };
    return Model;
  };