package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_330 {
    private val production = Production1_330("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}