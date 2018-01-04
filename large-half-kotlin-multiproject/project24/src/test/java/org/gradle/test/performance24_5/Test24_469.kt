package org.gradle.test.performance24_5

import org.junit.Assert.*

class Test24_469 {
    private val production = Production24_469("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}