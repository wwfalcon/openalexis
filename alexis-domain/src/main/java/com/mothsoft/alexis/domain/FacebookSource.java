/*   Copyright 2012 Tim Garrett, Mothsoft LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
//package com.mothsoft.alexis.domain;
//
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.Table;
//
//@Entity(name = "FacebookSource")
//@Table(name = "facebook_source")
//@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
//public class FacebookSource extends Source {
//
//    @ManyToOne
//    @JoinColumn(name = "social_connection_id")
//    private SocialConnection socialConnection;
//
//    public FacebookSource(final SocialConnection socialConnection) {
//        if (!SocialNetworkType.F.equals(socialConnection.getSocialNetworkType())) {
//            throw new IllegalArgumentException("Social Connection: " + socialConnection.getId()
//                    + " is not valid for Facebook.");
//        }
//        this.socialConnection = socialConnection;
//    }
//
//    protected FacebookSource() {
//
//    }
//
//    public String getDescription() {
//        return this.socialConnection.getRemoteUsername() + " - Facebook";
//    }
//
//    public SocialConnection getSocialConnection() {
//        return this.socialConnection;
//    }
//
//    @Override
//    public SourceType getSourceType() {
//        return SourceType.FACEBOOK;
//    }
//
// }
