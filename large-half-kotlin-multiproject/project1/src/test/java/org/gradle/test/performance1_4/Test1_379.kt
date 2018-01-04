package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_379 {
    private val production = Production1_379("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}