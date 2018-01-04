package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_329 {
    private val production = Production1_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}