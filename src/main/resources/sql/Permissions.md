selectPermissions
===
```
select r.name,p.permissionName,p.permissionDesc,a.action,a.describe from permission p
left join role_permission rp on p.id = rp.permissionId
left join actions a on rp.actionId = a.id
left join role r on r.id = rp.roleId
left join account_role ar on ar.roleId = r.id
left join account ac on ar.userId = ac.id
where ac.username = #username#
```