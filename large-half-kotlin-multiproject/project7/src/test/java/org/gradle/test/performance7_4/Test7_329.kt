package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_329 {
    private val production = Production7_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}