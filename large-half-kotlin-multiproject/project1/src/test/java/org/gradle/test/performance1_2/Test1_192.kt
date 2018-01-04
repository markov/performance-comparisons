package org.gradle.test.performance1_2

import org.junit.Assert.*

class Test1_192 {
    private val production = Production1_192("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}