package org.gradle.test.performance34_3

import org.junit.Assert.*

class Test34_283 {
    private val production = Production34_283("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}