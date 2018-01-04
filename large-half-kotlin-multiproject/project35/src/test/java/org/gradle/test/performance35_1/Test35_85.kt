package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_85 {
    private val production = Production35_85("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}