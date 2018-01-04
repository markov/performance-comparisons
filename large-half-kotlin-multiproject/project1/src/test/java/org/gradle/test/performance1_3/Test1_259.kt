package org.gradle.test.performance1_3

import org.junit.Assert.*

class Test1_259 {
    private val production = Production1_259("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}