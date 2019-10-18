selectUser
===
select * from account
where username= #username#
@orm.many({"id":"userId"},"account.selectRole","Role");

selectRole
===
select r.* from account_role ar
join role r on ar.roleId=r.id
where ar.userId = #userId#
