package org.gradle.test.performance24_4

import org.junit.Assert.*

class Test24_347 {
    private val production = Production24_347("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}