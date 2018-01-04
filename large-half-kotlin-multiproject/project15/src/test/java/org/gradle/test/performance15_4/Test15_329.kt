package org.gradle.test.performance15_4

import org.junit.Assert.*

class Test15_329 {
    private val production = Production15_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}