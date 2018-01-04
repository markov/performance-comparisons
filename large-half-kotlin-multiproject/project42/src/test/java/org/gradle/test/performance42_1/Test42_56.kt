package org.gradle.test.performance42_1

import org.junit.Assert.*

class Test42_56 {
    private val production = Production42_56("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
