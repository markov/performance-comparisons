package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_347 {
    private val production = Production29_347("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}