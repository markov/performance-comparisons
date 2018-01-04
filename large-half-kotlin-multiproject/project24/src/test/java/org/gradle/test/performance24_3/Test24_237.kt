package org.gradle.test.performance24_3

import org.junit.Assert.*

class Test24_237 {
    private val production = Production24_237("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}