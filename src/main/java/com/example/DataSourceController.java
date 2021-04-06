/*
 * Copyright 2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Pavol Gressa
 * @since 2.5
 */
@Controller
public class DataSourceController {

    @Inject
    private DataSource dataSource;

    @Get
    String index() throws SQLException {
        Connection connection = dataSource.getConnection();
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM DUAL");
        resultSet.next();
        return resultSet.getString(1);
    }
}
