package org.gradle.test.performance1_2

import org.junit.Assert.*

class Test1_137 {
    private val production = Production1_137("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}