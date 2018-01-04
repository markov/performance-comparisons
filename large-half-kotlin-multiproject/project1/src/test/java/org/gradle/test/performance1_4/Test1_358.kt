package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_358 {
    private val production = Production1_358("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}