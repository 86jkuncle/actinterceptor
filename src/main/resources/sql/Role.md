selectRole
===
select * from role
where id = #roleId#
@orm.many({"id":"roleId"},"role.selectPermissions","Permission");

selectPermissions
===
select p.* from role_permission rp
join permission p on rp.permissionId = p.id
where rp.roleId = #roleId#