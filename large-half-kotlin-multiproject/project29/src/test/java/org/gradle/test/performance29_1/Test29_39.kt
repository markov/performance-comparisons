package org.gradle.test.performance29_1

import org.junit.Assert.*

class Test29_39 {
    private val production = Production29_39("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}