package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_303 {
    private val production = Production25_303("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}