this is learning project
aim:framework
springmvc
spring security
mybatis
hibernate4 
---
other fast framework
ui:
bootstrap
jquery
flex
-----------------------------------------------------------------------------------
<!--别名设置还是很实用的主要是对MAPPER映射文件，涉及参数可缩短书写长度-->
    <typeAliases>
        <typeAlias type="test.model.Test" alias="Test"/>
    </typeAliases>
<!--以下可不要了，直接在spring容器内进行扫描-->
<!-- <mappers>
<com.dao resource="com/test/com.dao/TestMapper.xml" />
</mappers>-->