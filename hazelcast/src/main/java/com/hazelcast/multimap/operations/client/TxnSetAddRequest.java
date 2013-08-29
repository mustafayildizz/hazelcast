///*
// * Copyright (c) 2008-2013, Hazelcast, Inc. All Rights Reserved.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package com.hazelcast.multimap.operations.client;
//
//import com.hazelcast.multimap.MultiMapPortableHook;
//import com.hazelcast.nio.serialization.Data;
//import com.hazelcast.transaction.TransactionContext;
//
///**
// * @author ali 6/11/13
// */
//public class TxnSetAddRequest extends TxnCollectionRequest {
//
//    public TxnSetAddRequest() {
//    }
//
//    public TxnSetAddRequest(String name, Data data) {
//        super(name, data);
//    }
//
//    public Object call() throws Exception {
//        final TransactionContext context = getEndpoint().getTransactionContext();
//        return context.getSet(name).add(data);
//    }
//
//    public int getClassId() {
//        return MultiMapPortableHook.TXN_SET_ADD;
//    }
//}
