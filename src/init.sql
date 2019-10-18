CREATE TABLE "account" (
                         "id" int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增id',
                         "name" varchar(255) DEFAULT NULL COMMENT '昵称',
                         "username" varchar(255) DEFAULT NULL COMMENT '登录名',
                         "password" varchar(255) DEFAULT NULL COMMENT '登录密码',
                         "avatar" varchar(255) DEFAULT NULL COMMENT '用户头像路径',
                         "status" int(10) DEFAULT NULL COMMENT '状态标识,0锁定,1有效',
                         "telephone" varchar(255) DEFAULT NULL COMMENT '手机号',
                         "lastLoginIp" varchar(255) DEFAULT NULL COMMENT '最后登录ip',
                         "lastLoginTime" datetime DEFAULT NULL COMMENT '最后登录时间',
                         "creatorId" int(11) DEFAULT NULL COMMENT '创建人id',
                         "createTime" datetime DEFAULT NULL COMMENT '创建时间',
                         "merchantCode" varchar(255) DEFAULT NULL COMMENT '商品代码',
                         "deleted" int(10) DEFAULT NULL COMMENT '删除标识 0有效,1删除',
                         PRIMARY KEY ("id")
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE "account_role" (
                              "userId" int(11) DEFAULT NULL COMMENT '用户id',
                              "roleId" int(11) DEFAULT NULL COMMENT '角色id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE "actions" (
                         "id" int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
                         "action" varchar(255) DEFAULT NULL COMMENT '操作',
                         "describe" varchar(255) DEFAULT NULL COMMENT '操作说明',
                         PRIMARY KEY ("id")
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


CREATE TABLE "permission" (
                            "id" int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
                            "pid" int(11) DEFAULT NULL COMMENT '父id',
                            "permissionId" varchar(255) DEFAULT NULL COMMENT '权限id',
                            "permissionName" varchar(255) DEFAULT NULL COMMENT '权限说明',
                            PRIMARY KEY ("id")
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

CREATE TABLE "role" (
                      "id" int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
                      "name" varchar(255) DEFAULT NULL COMMENT '权限名称',
                      "describe" varchar(255) DEFAULT NULL COMMENT '权限说明',
                      "status" int(10) DEFAULT NULL COMMENT '状态标识 0锁定 1有效',
                      "creatorId" int(11) DEFAULT NULL COMMENT '创建人id',
                      "createTime" datetime DEFAULT NULL COMMENT '创建时间',
                      "deleted" int(10) DEFAULT NULL COMMENT '删除标识 0 有效 1 删除',
                      PRIMARY KEY ("id")
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE "role_permission" (
                                 "roleId" int(11) DEFAULT NULL COMMENT '角色id',
                                 "permissionId" int(11) DEFAULT NULL COMMENT '数据资源id',
                                 "actions" varchar(255) DEFAULT NULL COMMENT '操作'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;