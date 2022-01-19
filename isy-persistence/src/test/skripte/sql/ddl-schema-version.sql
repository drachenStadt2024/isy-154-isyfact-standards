---
-- See the NOTICE file distributed with this work for additional
-- information regarding copyright ownership.
-- The Federal Office of Administration (Bundesverwaltungsamt, BVA)
-- licenses this file to you under the Apache License, Version 2.0 (the
-- License). You may not use this file except in compliance with the
-- License. You may obtain a copy of the License at
-- 
--     http://www.apache.org/licenses/LICENSE-2.0
-- 
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
-- implied. See the License for the specific language governing
-- permissions and limitations under the License.
---
-- ------------------------------------------------------------------------
-- Dieses Skript erzeugt die für die Versionsüberwachung benötigte Tabelle.
-- ------------------------------------------------------------------------
-- This script creates the tables needed for version control.
-- ------------------------------------------------------------------------

create table m_schema_version
(
    version_nummer varchar2(25 char),
    status  varchar2(25 char),
    constraint pk_m_schema_version primary key (version)
);