/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.chaosblade.exec.common.model.action;

import com.alibaba.chaosblade.exec.common.aop.EnhancerModel;

/**
 *
 * 要注入的异常
 *
 * @author Changjun Xiao
 */
public interface ActionExecutor {

    /**
     * Run executor
     *
     * @param enhancerModel
     * @throws Exception
     */
    void run(EnhancerModel enhancerModel) throws Exception;
}
