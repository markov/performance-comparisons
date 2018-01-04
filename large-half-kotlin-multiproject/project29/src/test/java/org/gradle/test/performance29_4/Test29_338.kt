package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_338 {
    private val production = Production29_338("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}