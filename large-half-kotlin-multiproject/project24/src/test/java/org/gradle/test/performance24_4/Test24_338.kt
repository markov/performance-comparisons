package org.gradle.test.performance24_4

import org.junit.Assert.*

class Test24_338 {
    private val production = Production24_338("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}