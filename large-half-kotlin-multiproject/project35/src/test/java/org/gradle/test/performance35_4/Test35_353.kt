package org.gradle.test.performance35_4

import org.junit.Assert.*

class Test35_353 {
    private val production = Production35_353("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}