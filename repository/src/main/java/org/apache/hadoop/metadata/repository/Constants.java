/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.metadata.repository;

public final class Constants {

    /**
     * Globally Unique identifier property key.
     */
    
    public static final String INTERNAL_PROPERTY_KEY_PREFIX = "__";
    public static final String GUID_PROPERTY_KEY = INTERNAL_PROPERTY_KEY_PREFIX + "guid";
    public static final String GUID_INDEX = "guid_index";

    /**
     * Entity type name property key.
     */
    public static final String ENTITY_TYPE_PROPERTY_KEY = INTERNAL_PROPERTY_KEY_PREFIX + "typeName";
    public static final String ENTITY_TYPE_INDEX = "type_index";

    /**
     * Entity type's super types property key.
     */
    public static final String SUPER_TYPES_PROPERTY_KEY = INTERNAL_PROPERTY_KEY_PREFIX + "superTypeNames";
    public static final String SUPER_TYPES_INDEX = "super_types_index";

    /**
     * Full-text for the entity for enabling full-text search.
     */
    //weird issue in TitanDB if __ added to this property key. Not adding it for now
    public static final String ENTITY_TEXT_PROPERTY_KEY = "entityText";

    /**
     * Properties for type store graph
     */
    public static final String TYPE_CATEGORY_PROPERTY_KEY = INTERNAL_PROPERTY_KEY_PREFIX + "type.category";
    public static final String VERTEX_TYPE_PROPERTY_KEY = INTERNAL_PROPERTY_KEY_PREFIX + "type";
    public static final String TYPENAME_PROPERTY_KEY = INTERNAL_PROPERTY_KEY_PREFIX + "type.name";

    /**
     * Trait names property key and index name.
     */
    public static final String TRAIT_NAMES_PROPERTY_KEY = INTERNAL_PROPERTY_KEY_PREFIX + "traitNames";
    public static final String TRAIT_NAMES_INDEX = "trait_names_index";

    public static final String VERSION_PROPERTY_KEY = INTERNAL_PROPERTY_KEY_PREFIX + "version";
    public static final String TIMESTAMP_PROPERTY_KEY = INTERNAL_PROPERTY_KEY_PREFIX + "timestamp";

    /**
     * search backing index name.
     */
    public static final String BACKING_INDEX = "search";

    /**
     * search backing index name for vertex keys.
     */
    public static final String VERTEX_INDEX = "vertex_index";

    /**
     * search backing index name for edge labels.
     */
    public static final String EDGE_INDEX = "edge_index";

    public static final String FULLTEXT_INDEX = "fulltext_index";

    private Constants() {
    }
}
