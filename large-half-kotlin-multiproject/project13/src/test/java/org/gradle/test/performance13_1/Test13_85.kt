package org.gradle.test.performance13_1

import org.junit.Assert.*

class Test13_85 {
    private val production = Production13_85("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}