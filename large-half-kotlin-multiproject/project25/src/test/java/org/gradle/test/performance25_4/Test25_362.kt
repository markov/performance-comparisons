package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_362 {
    private val production = Production25_362("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}