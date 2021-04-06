## Micronaut 2.4.2 Documentation

- [User Guide](https://docs.micronaut.io/2.4.2/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.4.2/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.4.2/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature testcontainers documentation

- [https://www.testcontainers.org/](https://www.testcontainers.org/)

## Feature jdbc-hikari documentation

- [Micronaut Hikari JDBC Connection Pool documentation](https://micronaut-projects.github.io/micronaut-sql/latest/guide/index.html#jdbc)

## Feature oracle-cloud-sdk documentation

- [Micronaut Oracle Cloud SDK documentation](https://micronaut-projects.github.io/micronaut-oracle-cloud/latest/guide/)

- [https://docs.cloud.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdk.htm](https://docs.cloud.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdk.htm)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## Feature atp

Create dynamic group that matches the instance compartment or instance id:
```
Any {instance.compartment.id = 'ocid1.compartment.oc1.....'}
```

Create policy that allows dynamic group to work with autonomous wallet:
```
Allow dynamic-group <DYNAMIG-GROUP-NAME> to manage autonomous-database-family in compartment <COMPARTMENT-WITH-ATP>
```

Note: it uses whole database family, more finer policy should be possible to configure, link https://docs.oracle.com/en-us/iaas/Content/Identity/Reference/adbpolicyreference.htm
