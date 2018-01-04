package org.gradle.test.performance1_1

import org.junit.Assert.*

class Test1_41 {
    private val production = Production1_41("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}