package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_304 {
    private val production = Production1_304("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}