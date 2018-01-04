package org.gradle.test.performance29_3

import org.junit.Assert.*

class Test29_295 {
    private val production = Production29_295("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}