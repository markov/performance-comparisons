package org.gradle.test.performance24_1

import org.junit.Assert.*

class Test24_25 {
    private val production = Production24_25("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}