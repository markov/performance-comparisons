package org.gradle.test.performance1_1

import org.junit.Assert.*

class Test1_62 {
    private val production = Production1_62("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}