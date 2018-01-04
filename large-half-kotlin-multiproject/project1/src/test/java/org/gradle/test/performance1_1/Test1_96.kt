package org.gradle.test.performance1_1

import org.junit.Assert.*

class Test1_96 {
    private val production = Production1_96("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}