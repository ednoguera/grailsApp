package org.grails.guides

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Vehicle {

    Integer year

    String name
    String make
    String model

    static constraints = {
        year min: 1900
        name maxSize: 255
    }
}
